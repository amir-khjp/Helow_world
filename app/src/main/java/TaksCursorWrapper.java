import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by itlab on 9/5/2017.
 */

public class TaksCursorWrapper extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public TaksCursorWrapper(Cursor cursor) {
        super(cursor);
    }
    public Task getTask(){
        Task task =new Task();
        task.setNeme(getString(getColumnIndex((DataBseSchema.TaskDataBase.cols.NAME))) );
        task.setDay(getString(getColumnIndex((DataBseSchema.TaskDataBase.cols.DAY))) );
        task.setTime(getString(getColumnIndex((DataBseSchema.TaskDataBase.cols.TIME))) );
        task.setDate(getString(getColumnIndex((DataBseSchema.TaskDataBase.cols.DATE))) );
        task.setDesc(getString(getColumnIndex((DataBseSchema.TaskDataBase.cols.DESC))) );
        task.setImportance(getString(getColumnIndex((DataBseSchema.TaskDataBase.cols.IMPORTANCE))) );
        return task;

    }
}
