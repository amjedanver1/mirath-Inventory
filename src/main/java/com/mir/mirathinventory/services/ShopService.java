package com.mir.mirathinventory.services;

import com.mir.mirathinventory.dto.tenent.ShopDetails;

public interface ShopService {
    public void add(ShopDetails shopDetails);
    public void update(ShopDetails shopDetails);
    public void delete(ShopDetails shopDetails);
}
