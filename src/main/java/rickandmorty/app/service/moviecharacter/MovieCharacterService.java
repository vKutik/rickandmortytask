package rickandmorty.app.service.moviecharacter;

import rickandmorty.app.model.MovieCharacter;

import java.util.List;

public interface MovieCharacterService {

    MovieCharacter create(MovieCharacter movieCharacter);
    void delete(Long id);

    MovieCharacter update(Long id, MovieCharacter movieCharacter);

    MovieCharacter get(Long id);
    List<MovieCharacter> getAll();

}
