
package br.com.ifsc_plus;

import br.com.ifsc_plus.model.Curso;
import br.com.ifsc_plus.dao.CursoDao;
import br.com.ifsc_plus.model.Aluno;
import br.com.ifsc_plus.dao.AlunoDao;
import br.com.ifsc_plus.model.Matricula;
import br.com.ifsc_plus.dao.MatriculaDAO;

public class IFSC_plus {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setNome("Curso de node");
        curso1.setCargaHoraria(20);
        
        CursoDao cursoDao = new CursoDao();
        cursoDao.salvar(curso1);
        
    }
}
