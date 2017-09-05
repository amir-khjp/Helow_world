import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by itlab on 9/5/2017.
 */

public class DBMnager {
    Context mContext;
    SQLiteDatabase mDataBase;
    public DBMnager (Context context){

        mContext = context.getApplicationContext();
        mDataBase = new DataBaseHelper(mContext).getWritableDatabase();
    }


    public void addTask(Task task){
        ContentValues contentValues = getTaskdata(task);
        mDataBase.insert(DataBseSchema.TaskDataBase.DB_NAME,null,contentValues);
    }

    private ContentValues getTaskdata(Task task){
        ContentValues values= new ContentValues();

        values.put(DataBseSchema.TaskDataBase.cols.NAME , task.getNeme());
        values.put(DataBseSchema.TaskDataBase.cols.DAY , task.getNeme());
        values.put(DataBseSchema.TaskDataBase.cols.DATE , task.getNeme());
        values.put(DataBseSchema.TaskDataBase.cols.DESC , task.getNeme());
        values.put(DataBseSchema.TaskDataBase.cols.IMPORTANCE , task.getNeme());

        return values;

    }
    public ArrayList<Task> getTask(){
        ArrayList<Task> tasks= new ArrayList<>();

        TaksCursorWrapper mcursorWrapper =queryTask();

        mcursorWrapper.moveToFirst();

        while (!mcursorWrapper.isAfterLast()){
            tasks.add(mcursorWrapper.getTask());
            mcursorWrapper.moveToNext();
        }
        return tasks;
    }
    public TaksCursorWrapper queryTask(){
        Cursor cursor = mDataBase.query(DataBseSchema.TaskDataBase.DB_NAME,null,null,null,null,null,null,null);
        return new TaksCursorWrapper(cursor);
    }
    public void delet(){
        mDataBase.delete(DataBseSchema.TaskDataBase.DB_NAME,DataBseSchema.TaskDataBase.cols.DAY + "جمعه = " ,null);

    }
}
