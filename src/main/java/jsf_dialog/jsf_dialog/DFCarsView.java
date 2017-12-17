/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf_dialog.jsf_dialog;

/**
 *
 * @author vasil
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "dfCarsView")
@SessionScoped
public class DFCarsView implements Serializable {

    Logger log = Logger.getLogger(getClass().getName());
    private List<Car> cars;
    private List<Users> users;

//    @ManagedProperty("#{carService}")
//    private CarService service;
    @PostConstruct
    public void init() {
        log.info("init");
        cars = new LinkedList();
        users = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Car car = new Car();
            car.setId(new Long(i));
            car.setName("car_" + i);
            cars.add(car);

            Users user = new Users(new Long(i), "user_" + i);
            users.add(user);
        }

    }

    public List<Car> getCars() {
        log.log(Level.INFO, "getCars() => {0}", cars.size());
        return cars;
    }

    public List<Users> getUsers() {
        log.log(Level.INFO, "getUsers() => {0}", users.size());
        return users;
    }

    public void selectCarFromDialog(Users car) {
        log.log(Level.INFO, "user => {0}", car);
        RequestContext.getCurrentInstance().closeDialog(car);
    }
}
