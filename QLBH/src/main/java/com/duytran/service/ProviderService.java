package com.duytran.service;


import com.duytran.entity.Provider;
import com.duytran.model.ProviderDTO;

import java.util.List;

public interface ProviderService {
    public List<ProviderDTO> getAllProviders();
    public void addProvider(ProviderDTO provider);
    public void deleteProvider(ProviderDTO provider);
    public void updateProvider(ProviderDTO provider);
    public ProviderDTO getProviderById(int id);
}
