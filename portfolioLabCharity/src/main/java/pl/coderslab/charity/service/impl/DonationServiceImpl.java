package pl.coderslab.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.service.DonationService;

@Service
public class DonationServiceImpl extends GenericServiceImpl<Donation, DonationRepository> implements DonationService {

    @Autowired
    public DonationServiceImpl(DonationRepository repository) {
        super(repository);
    }

    public Integer getQuantityOfDonatedBags () {
        Integer sum = 0;
        for (Donation donation : super.repository.findAll()) {
            sum += donation.getQuantity();
        }
        return sum;
    }
    public Integer getQuantityOfDonations () {
        return super.repository.findAll().size();
    }
}
