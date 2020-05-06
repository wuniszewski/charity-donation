package pl.coderslab.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.service.DonationService;

public class DonationServiceImpl extends GenericServiceImpl<Donation, DonationRepository> implements DonationService {

    @Autowired
    public DonationServiceImpl(DonationRepository repository) {
        super(repository);
    }
}
