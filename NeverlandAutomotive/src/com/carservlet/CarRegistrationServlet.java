package com.carservlet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

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
 * Servlet implementation class CarRegistrationServlet
 */
@WebServlet("/CarRegistrationServlet")
public class CarRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Car car = new Car();
		
		car.setImage(request.getParameter("image"));
		car.setVinNumber(request.getParameter("vinNumber"));
		car.setIsUsed(Boolean.parseBoolean(request.getParameter("isUsed")));
		car.setMake(request.getParameter("make"));
		car.setModel(request.getParameter("model"));
		car.setYear(request.getParameter("year"));
		car.setMileage(request.getParameter("mileage"));
		car.setPrice(Double.parseDouble(request.getParameter("price")));
		car.setColor(request.getParameter("color"));
		car.setBattery(request.getParameter("battery"));
		car.setMotor(request.getParameter("motor"));
//		car.setDaysPosted(Integer.parseInt(request.getParameter("daysPosted")));
		car.setDescription(request.getParameter("description"));
		
		//Repository.getCarList().add(car);
		
		Repository.addToDataFile(car);
		
		List<Car> cars = Repository.readDataFile();
		
//		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Genevieve\\eclipse-workspace\\car-dealership\\NeverlandAutomotive\\WebContent\\WEB-INF\\Vehicles.txt", true));
//		writer.write(car.toFile());
//		writer.newLine();
//		writer.close();

		HttpSession session = request.getSession(true);
		session.setAttribute("cars", cars);
		
		RequestDispatcher rs = request.getRequestDispatcher("display-car.jsp");
		rs.forward(request, response);
	}

}
