package it.unisa.is.monkey.web;

import it.unisa.is.monkey.applicationLogic.monkeyEntita.Utente;
import it.unisa.is.monkey.model.MySQLUtenteDAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.Console;

//Aggiorna le informazioni dell'utente lato admin

@WebServlet("/UpdateUserIntoDB")
public class UpdateUserIntoDB extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserIntoDB() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession();

        synchronized(session) {
            MySQLUtenteDAO udao = new MySQLUtenteDAO();
            boolean amministratore = false;
            if(request.getParameter("amministratore") != null &&
                    Boolean.parseBoolean(request.getParameter("amministratore")))
            {
                amministratore = true;
            }
            Utente u = new Utente(null, null, null, null, null,
                    null, null, null, amministratore);
            udao.updateUtente(u);
            request.getRequestDispatcher("DisplayAdminUsers").forward(request, response);
        }
    }


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
