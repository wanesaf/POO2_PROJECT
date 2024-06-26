package Controller;

import View.ChambreAdminView;
import View.ClientView;
import View.PageAccueilAdminView;
import View.ReservationAdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageAccueilAdminController implements ActionListener {

    PageAccueilAdminView view  ;

    public PageAccueilAdminController(PageAccueilAdminView view) {
        this.view = view;
    }


        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton1())
            {
                view.getFrame().dispose();
                new ReservationAdminView();
            }
            if (e.getSource()==view.getButton2())
            {
                view.getFrame().dispose();
                new ClientView();
            }
            if(e.getSource()==view.getButton3())
            {
                view.getFrame().dispose();
                new ChambreAdminView();
            }
            if (e.getSource()==view.getButton4())
            {
                view.getFrame().dispose();
            }
    }
}
