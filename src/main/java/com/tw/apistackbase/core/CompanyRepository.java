package com.tw.apistackbase.core;

import com.tw.apistackbase.core.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
