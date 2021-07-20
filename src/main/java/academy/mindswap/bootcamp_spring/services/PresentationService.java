package academy.mindswap.bootcamp_spring.services;

import academy.mindswap.bootcamp_spring.persistence.entity.Presentation;
import academy.mindswap.bootcamp_spring.persistence.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PresentationService {

    private PresentationRepository repository;

    public List<Presentation> getPresentations() {
        List<Presentation> listPresentations = new ArrayList<>();
        listPresentations.addAll(repository.findPresentations());
        return listPresentations;
    }

    @Autowired
    public void setRepository(PresentationRepository presentationRepository) {
        this.repository = presentationRepository;
    }
}
