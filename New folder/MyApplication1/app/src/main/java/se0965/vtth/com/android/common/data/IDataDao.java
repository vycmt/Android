package se0965.vtth.com.android.common.data;

import java.util.List;

/**
 * Created by SONY on 5/28/2016.
 */
public interface IDataDao<Model,Id> {
    Model getById(Id id);
    List<Model> getAll();
    boolean deleteById(Id id);
    void insert (Model model);
}
