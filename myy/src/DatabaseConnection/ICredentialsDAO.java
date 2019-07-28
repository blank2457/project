package DatabaseConnection;

import java.util.List;

import Information.Credentials;
import Information.HouseInformation;
import Information.OwnerInformation;

public interface ICredentialsDAO {
	public boolean insertCredentials(Credentials credentials);
	public String getCredentials(String username);
	public boolean insertOwnerDetails(OwnerInformation ownerInformation, String username);
	public OwnerInformation getOwnerDetails(String username);
	public boolean insertHouseDetails(HouseInformation house, String name,String phone_no);
	public HouseInformation getHouseDetails(String address);
	public List<HouseInformation> getAllHouseDetailsOfParticulaOwner( String name,String phone_no);
	
}
