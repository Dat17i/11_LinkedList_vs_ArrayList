import java.util.ArrayList;

public interface ITestRepository<T> {


        ArrayList<T> readAll();
        T read(int id);
        void create(T student);
        void update(T student);
        void delete(int id);

}
