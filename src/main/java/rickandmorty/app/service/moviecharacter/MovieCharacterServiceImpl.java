package rickandmorty.app.service.moviecharacter;

import org.springframework.stereotype.Service;
import rickandmorty.app.model.MovieCharacter;
import rickandmorty.app.repository.MovieCharacterRepository;

import java.util.List;

@Service
public class MovieCharacterServiceImpl implements MovieCharacterService {

    private final MovieCharacterRepository repository;

    public MovieCharacterServiceImpl(MovieCharacterRepository repository) {
        this.repository = repository;
    }

    @Override
    public MovieCharacter create(MovieCharacter movieCharacter) {
        return repository.save(movieCharacter);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public MovieCharacter update(Long id, MovieCharacter movieCharacter) {
        return null;
    }

    @Override
    public MovieCharacter get(Long id) {
        return null;
    }

    @Override
    public List<MovieCharacter> getAll() {
        return null;
    }
}
