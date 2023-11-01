package web.service;

import web.Dao.DaoCar;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private DaoCar carDao;

    @Override
    public List<Car> getCars(int x) {
        return carDao.getCars(x);
    }

}
