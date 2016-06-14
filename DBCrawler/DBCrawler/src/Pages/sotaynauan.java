/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import DBUtils.DAO;
import DTO.CategoryDTO;
import DTO.FoodDTO;
import DTO.FoodDetailDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author SONY
 */
public class sotaynauan implements parser {

    private List<String> linkCategory;
    private List<String> categoryName;

    @Override
    public void scanning(String page) {
        try {
            // Main page
            Document doc = Jsoup.connect(page).get();
            parseCategory(doc);
            for (int j = linkCategory.size() - 1; j >= 0; j--) {
                // Page category at page 1
                try {
                    Document docCategory = Jsoup.connect(linkCategory.get(j)).get();
                    // Get number page of category
                    int number = pagenumber(linkCategory.get(j), docCategory);
                    for (int i = 1; i <= number; i++) {
                        String link = "";
                        if (i == 1) {
                            link = linkCategory.get(j);
                        } else {
                            link = linkCategory.get(j) + "page/" + Integer.toString(i) + "/";
                        }
                        // Local Page (Example page 1 of category A)
                        Document docCategoryPage = Jsoup.connect(link).get();
                        Elements listLinkFood = docCategoryPage.select("article>a[href]");
                        for (Element element : listLinkFood) {
                            String linkFood = element.attr("href");
                            Document docFood = Jsoup.connect(linkFood).get();
                            // set data to food
                            DAO dao = new DAO();
                            FoodDTO food = new FoodDTO();
                            food.setFoodName(parseFoodName(docFood));
                            food.setDescription(parseDescription(docFood));
                            food.setImages(parseImages(docFood));
                            food.setListMaterial(parseListMaterial(docFood));
                            food.setCategoryID(dao.getCategoryId(categoryName.get(j)));
                            food.setVisitNum(0);
                            if (dao.getFoodId(food.getFoodName()) == -1) {
                                dao.addFood(food);
                                FoodDetailDTO foodDetail = new FoodDetailDTO();
                                foodDetail.setFoodID(dao.getFoodId(food.getFoodName()));
                                foodDetail.setMaterialDetail(parseMaterialHTML(docFood));
                                foodDetail.setTutorial(parseTutorialHTML(docFood));
                                foodDetail.setSource(page);
                                if (dao.getFoodDetailId(foodDetail.getFoodID()) == -1) {
                                    dao.addFoodDetail(foodDetail);
                                } else {
                                    dao.updateFoodDetail(foodDetail);
                                }

                            } else {
                                int foodID = dao.getFoodId(food.getFoodName());
                                dao.updateFood(food, foodID);
                                FoodDetailDTO foodDetail = new FoodDetailDTO();
                                foodDetail.setFoodID(foodID);
                                foodDetail.setMaterialDetail(parseMaterialHTML(docFood));
                                foodDetail.setTutorial(parseTutorialHTML(docFood));
                                foodDetail.setSource(page);
                                if (dao.getFoodDetailId(foodDetail.getFoodID()) == -1) {
                                    dao.addFoodDetail(foodDetail);
                                } else {
                                    dao.updateFoodDetail(foodDetail);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(linkCategory.get(j));
                }

            }

        } catch (IOException ex) {
            System.out.println("ERROR: Connection To Page Fail--------");
            System.out.println(page);
        }
    }

    @Override
    public void parseCategory(Document doc) {
        linkCategory = new ArrayList<String>();
        categoryName = new ArrayList<String>();
        
        Elements category_HTML = doc.select("li#menu-item-4658>ul.sub-menu>li a");
        for (Element element : category_HTML) {
            CategoryDTO category = new CategoryDTO(element.text());
            linkCategory.add(element.attr("href"));
            categoryName.add(element.text());
            DAO dao = new DAO();
            if (dao.getCategoryId(element.text()) == -1) {
                dao.addCategory(category);
            }

        }
    }

    @Override
    public String parseFoodName(Document doc) {
        String foodName = "";
        Element Foodname_html = doc.select("h2.entry-title>a[title]").first();
        if (Foodname_html != null) {
            foodName = Foodname_html.text();
        }
        return foodName;
    }

    @Override
    public String parseImages(Document doc) {
        String linkImage = "";
        Element LinkImage_html = doc.select("a[rel=prettyPhoto[slides]]").first();
        if (LinkImage_html != null) {
            linkImage = LinkImage_html.attr("href");
        }
        return linkImage;
    }

    @Override
    public String parseListMaterial(Document doc) {
        String listMaterial = "";
        Elements material_Html = doc.select("ul.ingredients>li");
        for (Element element : material_Html) {
            listMaterial = listMaterial + element.select("a[href]").text().trim() + ";";
        }
        return listMaterial;
    }

    @Override
    public String parseDescription(Document doc) {
        String description = "";
        Elements description_Html = doc.select("div.pf-content>*");
        for (Element element : description_Html) {
            if (element.id().equals("purerecipe-wrapper")) {
                break;
            } else {
                description = description + element.text();
            }
        }
        if (description.equals("")) {
            for (Element element : doc.select("div#recipe-content>p")) {
                if (!element.text().equals("")) {
                    description = element.text();
                    break;
                }
            }
        }
        return description;
    }

    @Override
    public String parseMaterialHTML(Document doc) {
        String materialHTML = "";
        if (doc.select("ul.ingredients").size() > 0) {
            doc.select("ul.ingredients>li>*").unwrap();
            materialHTML = doc.select("ul.ingredients").outerHtml();

        }

//        Elements material_tmp = doc.select("ul.ingredients>li");
//        for (Element element : material_tmp) {
//            element.remove();
//            System.out.println(element.outerHtml());
//        }
//        
        return materialHTML;
    }

    @Override
    public String parseTutorialHTML(Document doc) {
        String tutorialHTML = "";
        tutorialHTML = doc.select("div.instructions").outerHtml();
        return tutorialHTML;
    }

    public int pagenumber(String category, Document doc) {
        String pageNumber = "";
        int number = 0;
        try {
            doc = Jsoup.connect(category).get();
            Elements listPage = doc.select("section#content>div>a[href]");
            Element page = listPage.get(listPage.size() - 1);
            pageNumber = page.attr("href");
            int beginIndex = pageNumber.indexOf("page") + 5;
            int lastIndex = pageNumber.length() - 1;
            pageNumber = pageNumber.substring(beginIndex, lastIndex);
            number = Integer.parseInt(pageNumber);
        } catch (IOException ex) {
            System.out.println("ERROR:  Connection To Page Fail");
        }
        return number;
    }
}
