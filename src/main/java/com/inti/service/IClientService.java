package com.inti.service;

import java.util.List;

import com.inti.model.Client;

public interface IClientService {
	
	public void saveClient(Client client);
	public List<Client> getListeClients();
	public void deleteClient(int id);
	public void updateClient(Client client);

}
