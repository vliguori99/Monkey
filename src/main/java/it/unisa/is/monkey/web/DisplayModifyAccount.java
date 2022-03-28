package it.unisa.is.monkey.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.unisa.is.monkey.applicationLogic.monkeyEntita.Utente;
import it.unisa.is.monkey.model.MySqlUtenteDao;

//Display modifica profilo lato utente

@WebServlet("/DisplayModifyAccount")
public class DisplayModifyAccount extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DisplayModifyAccount() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        synchronized(session) {
            String id = request.getParameter("id");
            MySqlUtenteDao utentedao = new MySqlUtenteDao();
            Utente utente_x = utentedao.getUtente(id);
            request.setAttribute("utenteX", utente_x);
            request.getRequestDispatcher("modificaProfilo.jsp").forward(request, response);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}


