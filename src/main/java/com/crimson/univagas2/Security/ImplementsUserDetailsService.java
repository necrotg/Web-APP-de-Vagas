package com.crimson.univagas2.Security;

import com.crimson.univagas2.Model.Empresa;
import com.crimson.univagas2.Repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService {

    @Autowired
    private EmpresaRepository er;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Empresa empresa = er.findByUsername(username);

        if(empresa == null){
            throw new UsernameNotFoundException("Usuario não encontrado!");
        }
        return new User(empresa.getUsername(), empresa.getPassword(), true, true, true, true, empresa.getAuthorities());
    }
}
