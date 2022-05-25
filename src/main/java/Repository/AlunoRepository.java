package Repository;


import Entities.Aluno;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


    /**
     * @param dataDeNascimento: data de nascimento dos alunos
     * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
     */

    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);

}
