package se0965.vtth.com.android.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import se0965.vtth.com.android.model.Food;

/**
 * Created by SONY on 5/28/2016.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private final String TAG = getClass().getSimpleName();
    private static final String DATABASE_NAME="Food.sqlite";
    private static final int DATABASE_VERSION=2;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        Log.i(TAG,"DatabaseHelper.onCreate()");
        try {
            // Table của Android DB
            TableUtils.createTable(connectionSource, Food.class);
        } catch (SQLException e) {
            Log.i(TAG,"DatabaseHelper can not create databse", e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        Log.i(TAG,"DatabaseHelper.onUpgrade()");
        try {
            TableUtils.dropTable(connectionSource,Food.class,true);
        } catch (SQLException e) {
            Log.i(TAG,"DatabaseHelper can not drop databse", e);
        }
    }

    public void clearDatabase() {
        try {
            TableUtils.clearTable(connectionSource, Food.class);
        } catch (SQLException e) {
            Log.e(TAG, "can't clear database", e);
        }
    }
}
