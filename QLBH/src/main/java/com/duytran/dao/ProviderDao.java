package com.duytran.dao;

import com.duytran.entity.Provider;
import java.util.List;

public interface ProviderDao {
    public List<Provider> getAllProviders();
    public void addProvider(Provider provider);
    public void deleteProvider(Provider provider);
    public void updateProvider(Provider provider);
    public Provider getProviderById(int id);
}
