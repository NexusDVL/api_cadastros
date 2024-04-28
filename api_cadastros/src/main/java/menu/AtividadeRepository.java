package menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AtividadeRepository extends MongoRepository<Atividade, String> {
}