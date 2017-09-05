import android.content.Context;
import android.content.pm.FeatureInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.version;

/**
 * Created by itlab on 9/5/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper{

    final static int VERSION = 1;
    final static String DATABASE_NAME = "task.deb";

    public DataBaseHelper(Context context) {
        super(context,DATABASE_NAME , null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("creat table"+ DataBseSchema.TaskDataBase.DB_NAME+"("+
                "_id integer primary key autoincrement , "+
                DataBseSchema.TaskDataBase.cols.NAME + ","+
                DataBseSchema.TaskDataBase.cols.DAY + ","+
                DataBseSchema.TaskDataBase.cols.TIME + ","+
                DataBseSchema.TaskDataBase.cols.DATE + ","+
                DataBseSchema.TaskDataBase.cols.DESC + ","+
                DataBseSchema.TaskDataBase.cols.IMPORTANCE + ","+
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
