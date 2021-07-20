package academy.mindswap.bootcamp_spring.services;

import academy.mindswap.bootcamp_spring.persistence.entity.Workshop;
import academy.mindswap.bootcamp_spring.persistence.repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkshopService {

    private WorkshopRepository repository;

    public List<Workshop> getWorkshops() {
        List<Workshop> listWorkshops = new ArrayList<>();
        listWorkshops.addAll(repository.findWorkshops());
        return listWorkshops;
    }

    @Autowired
    public void setRepository(WorkshopRepository workshopRepository) {
        this.repository = workshopRepository;
    }
}
