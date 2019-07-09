package com.duytran.service.impl;

import com.duytran.dao.ProviderDao;
import com.duytran.model.ProviderDTO;
import com.duytran.entity.Provider;
import com.duytran.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderDao providerDao;

    @Override
    public List<ProviderDTO> getAllProviders() {
        List<Provider> providers = providerDao.getAllProviders();

        List<ProviderDTO> listProviders = new ArrayList<ProviderDTO>();
        for(Provider p : providers){
            ProviderDTO providerDTO = new ProviderDTO();
            providerDTO.setId(p.getId());
            providerDTO.setProvider_name(p.getProvider_name());
            providerDTO.setAddress(p.getAddress());
            providerDTO.setPhone(p.getPhone());
            providerDTO.setEmail(p.getEmail());
            providerDTO.setMore_info(p.getMore_info());
            providerDTO.setContract_date(p.getContract_date());

            listProviders.add(providerDTO);
        }
        return listProviders;
    }

    @Override
    public void addProvider(ProviderDTO provider) {
        Provider p = new Provider();
        p.setId(provider.getId());
        p.setProvider_name(provider.getProvider_name());
        p.setAddress(provider.getAddress());
        p.setPhone(provider.getPhone());
        p.setEmail(provider.getEmail());
        p.setMore_info(provider.getMore_info());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate = formatter.format(date);
        Date current = null;
        try {
            current = formatter.parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        p.setContract_date(current);
        providerDao.addProvider(p);
    }

    @Override
    public ProviderDTO getProviderById(int id) {
        Provider p = providerDao.getProviderById(id);
        ProviderDTO providerDTO = new ProviderDTO();
        providerDTO.setId(p.getId());
        providerDTO.setProvider_name(p.getProvider_name());
        providerDTO.setAddress(p.getAddress());
        providerDTO.setPhone(p.getPhone());
        providerDTO.setEmail(p.getEmail());
        providerDTO.setMore_info(p.getMore_info());
        providerDTO.setContract_date(p.getContract_date());
        return providerDTO;

    }

    @Override
    public void deleteProvider(ProviderDTO provider) {
        Provider p = new Provider();
        p.setId(provider.getId());
        p.setProvider_name(provider.getProvider_name());
        p.setAddress(provider.getAddress());
        p.setPhone(provider.getPhone());
        p.setEmail(provider.getEmail());
        p.setMore_info(provider.getMore_info());
        p.setContract_date(provider.getContract_date());
        providerDao.deleteProvider(p);

    }

    @Override
    public void updateProvider(ProviderDTO provider) {
        Provider p = new Provider();
        p.setId(provider.getId());
        p.setProvider_name(provider.getProvider_name());
        p.setAddress(provider.getAddress());
        p.setPhone(provider.getPhone());
        p.setEmail(provider.getEmail());
        p.setMore_info(provider.getMore_info());
        p.setContract_date(provider.getContract_date());

        providerDao.updateProvider(p);
    }

}