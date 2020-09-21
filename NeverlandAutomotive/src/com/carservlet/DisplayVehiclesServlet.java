package com.carservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.car.Car;
import com.car.repository.Repository;

/**
 * Servlet implementation class DisplayVehiclesServlet
 */
@WebServlet("/DisplayVehiclesServlet")
public class DisplayVehiclesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayVehiclesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Car> cars = Repository.readDataFile();
		
		List<Car> unsoldCars = new ArrayList<Car>();
		
		for(Car car : cars) {
			if(car.isSold() == false) {
				unsoldCars.add(car);
			}
		}
		
		HttpSession session = request.getSession(true);
		session.setAttribute("cars", unsoldCars);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
