package se0965.vtth.com.android.common.data;

import android.content.Context;
import android.util.Log;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

import se0965.vtth.com.android.data.DatabaseHelper;

/**
 * Created by SONY on 5/28/2016.
 */
public abstract class DataDao<Model, Id> implements IDataDao<Model, Id> {

    // DAO của Android DB
    protected Dao<Model, Id> dao;
    protected Class<Model> modelClass;

    public DataDao(Context context, Class<Model> modelClass) {
        this.modelClass = modelClass;

        try {
            dao = OpenHelperManager.getHelper(context, DatabaseHelper.class).getDao(modelClass);
        } catch (SQLException e) {
            Log.e(getClass().getName(), "Create DAO fail" + e.getMessage());
        }
    }

    public Dao<Model, Id> getDao() {
        return dao;
    }

    @Override
    public Model getById(Id id) {
        try {
            return dao.queryForId(id);
        } catch (SQLException e) {
            Log.e(getClass().getName(), "GetByID failed" + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Model> getAll() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            Log.e(getClass().getName(), "GetAll failed" + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteById(Id id) {
        try {
            dao.deleteById(id);
            return true;
        } catch (SQLException e) {
            Log.e(getClass().getName(), "DeleteByID failed" + e.getMessage());
            return false;
        }
    }

    @Override
    public void insert(Model model) {
        try {
            dao.create(model);
        } catch (SQLException e) {
            Log.e(getClass().getName(), "Insert failed" + e.getMessage());
        }
    }
}
