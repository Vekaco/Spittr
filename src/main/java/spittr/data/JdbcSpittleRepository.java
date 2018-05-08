package spittr.data;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class JdbcSpittleRepository implements SpittleRepository {
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        spittles.add(new Spittle("Test1", new Date()));
        spittles.add(new Spittle("Test2", new Date()));
        return spittles;
    }
}
