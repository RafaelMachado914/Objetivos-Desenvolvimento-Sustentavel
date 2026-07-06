
package br.com.ifsc_plus;

import br.com.ifsc_plus.model.Curso;
import br.com.ifsc_plus.dao.CursoDao;
import br.com.ifsc_plus.model.Aluno;
import br.com.ifsc_plus.dao.AlunoDao;
import br.com.ifsc_plus.model.Matricula;
import br.com.ifsc_plus.dao.MatriculaDAO;
import br.com.ifsc_plus.view.TelaMenu;

public class IFSC_plus {

    public static void main(String[] args) {

            java.awt.EventQueue.invokeLater(() -> {
        new TelaMenu().setVisible(true);
    });
        
    }
}
