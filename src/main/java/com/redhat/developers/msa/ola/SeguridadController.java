package com.redhat.developers.msa.ola;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.developers.pojo.CredencialAcessToken;
import com.redhat.developers.pojo.RegresoAccessToken;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/seguridad")
public class SeguridadController {

	
//	/**
//	 * Obtener el token corporativo
//	 * @return
//	 */
//	@CrossOrigin
//    @RequestMapping(method = RequestMethod.GET, value = "/credencial/", produces = "application/json")
//    @ApiOperation("Obtener el token credencial o corporativo")
//    public TokenCredencial GetTokenCredencial() {
//		return new TokenCredencial("QjQ2NTFDNjFGNTA5RkYwRjZGMEI0NEYyIzE4MC4xMDEuMTE2LjkjMTQ4MzYzMDgxMTMyNSNQRDk0Yld3Z2RtVnljMmx2YmowaU1TNHdJaUJsYm1OdlpHbHVaejBpU1ZOUExUZzROVGt0TVNJL1BqeDBiMnRsYmtSbFptbHVhWFJwYjI0K1BHNWhiV1UrUW1GeWNtbGxiblJ2Y3lCR1pYSnlkWHBqWVN3Z1JHRnRZWEpwY3p3dmJtRnRaVDQ4WVd4cFlYTStiakF4TURJM056d3ZZV3hwWVhNK1BIVnpaWEpKUkQ1dU1ERXdNamMzUEM5MWMyVnlTVVErUEM5MGIydGxia1JsWm1sdWFYUnBiMjQrI0RFU2VkZS9DQkMvUEtDUzVQYWRkaW5nI3YxI21leGljb2ludHJhbmV0I05PVF9VU0VEI1NIQTF3aXRoUlNBI3JOeitDV2xNUk1GQ3NSL2cwSUFNK0pQdUdlOUxFZjZEY29QSUJza2FKQmtXUVVPd3ovQ0phQktndndXcE5VVEEwL2dwdHQ3Z1hHM3hlZmVSeHdRR1ZWbnhmdEEyRWZ4bERmNkFDRkdKelFBdmZqVDNaVXgwM1YzMVJYZnllN3J6eSs5ZGR3c041cFl5eEtuVnZBL2lpQWRHc3RjRUF1UE8wck5lWjM3ZFpSND0=");
//    }
//	
//	
//	/**
//	 * Obtener el token corporativo
//	 * @param login
//	 * @return
//	 */
//	@CrossOrigin
//	@RequestMapping(value="/credencial/", method=RequestMethod.POST)
//	@ApiOperation(value = "Obtener el token credencial o corporativo ( en base en el login de un usuario y pass fijos )", response = TokenCredencial.class, produces = "application/json")
//    public @ResponseBody TokenCredencial PostTokenCredencial(@RequestBody CredencialLogin login) {
//		return new TokenCredencial("QjQ2NTFDNjFGNTA5RkYwRjZGMEI0NEYyIzE4MC4xMDEuMTE2LjkjMTQ4MzYzMDgxMTMyNSNQRDk0Yld3Z2RtVnljMmx2YmowaU1TNHdJaUJsYm1OdlpHbHVaejBpU1ZOUExUZzROVGt0TVNJL1BqeDBiMnRsYmtSbFptbHVhWFJwYjI0K1BHNWhiV1UrUW1GeWNtbGxiblJ2Y3lCR1pYSnlkWHBqWVN3Z1JHRnRZWEpwY3p3dmJtRnRaVDQ4WVd4cFlYTStiakF4TURJM056d3ZZV3hwWVhNK1BIVnpaWEpKUkQ1dU1ERXdNamMzUEM5MWMyVnlTVVErUEM5MGIydGxia1JsWm1sdWFYUnBiMjQrI0RFU2VkZS9DQkMvUEtDUzVQYWRkaW5nI3YxI21leGljb2ludHJhbmV0I05PVF9VU0VEI1NIQTF3aXRoUlNBI3JOeitDV2xNUk1GQ3NSL2cwSUFNK0pQdUdlOUxFZjZEY29QSUJza2FKQmtXUVVPd3ovQ0phQktndndXcE5VVEEwL2dwdHQ3Z1hHM3hlZmVSeHdRR1ZWbnhmdEEyRWZ4bERmNkFDRkdKelFBdmZqVDNaVXgwM1YzMVJYZnllN3J6eSs5ZGR3c041cFl5eEtuVnZBL2lpQWRHc3RjRUF1UE8wck5lWjM3ZFpSND0=");
//    }
	
	
	/**
	 * Obtener el access token
	 * @param credencial
	 * @return
	 */
	@CrossOrigin
	@RequestMapping(value="/accesstoken/", method=RequestMethod.POST)
	@ApiOperation(value = "Obtener el AccessToken", response = RegresoAccessToken.class, produces = "application/json")
    public @ResponseBody RegresoAccessToken postaccesstoken(@RequestBody CredencialAcessToken credencial) {
		
		String[] tokens = new String[10];
		tokens[0] = "AAEkZGZiYTBhMTUtNGYxMi00MDJmLTk3OTUtZjYwNGY0YTIyN2NmIjZCZbQGJr49jnoHYW669ucg5qn21LSIIHptIqIgCZaN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4Ai";
		tokens[1] = "R5dfd34DFDSFGGGGTk3OTUtZjYwNGY0YTIyN2NmIjZCZbQGJr49jnoHYW669ucg5qn21LSIIHptIqIgCZaN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh";
		tokens[2] = "4IIidi23948fdjfY0YTIyN2NmIjZCZbQGJr49jnoHYW669ucg5qn21LSIIHptIqIgCZaN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh45gdgFGd436566";
		tokens[3] = "KKKGjjkh6745656456IjZCZbQGJrfgsdfgsfdg9fgjnoHYW669ucg5qn21LSIIHfgfgsdfgfgstIqIgCZaN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh";
		tokens[4] = "454gdFGDFGFDg57577474ptIqIgCZaN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh45gdgFGd436566454576gdfgBdfdsfsdfdfrefretretretretrt";
		tokens[5] = "SSfdfdsfasdsfd5656436656456dggbmsN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh45gdgFGd436566454576gdfgBgfdgsfggh56564fghgfhfkkk";
		tokens[6] = "fgER6346HDrgdrggSFGSFgfg4565654Up97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh45gdgFGd436566454576gdfgBdfadfdffrgrggththTYTyettytrytrytryerty767";
		tokens[7] = "kJAkqwe3ei49349834934dfgdgdfgdZaN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh45gdgFGd436566454576gdfgBf56563FgfgsgFDfghgfGFSfg5";
		tokens[8] = "fGftRReed434532dewrwe7HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh45gdgFGd436566454576gdfgBfgdfgdGSDGFhghdghyTdfgh565635EGhdfghfTg";
		tokens[9] = "nGdfggfd54rTGFtrydfsdfs7uyjHaN687HZn4ymyvzAdUp97lNu57hM_2uDLDlvqxP0pe-r-XdK8eVxpdFMR0kB200d9PHwEuH_3BAgWdHnWAUDqG6lAyz-cNk6AdD-yC3Q8zK-R5zbpBw1A-TAw-B86Ry4-drTPcbQGkQZ1dq6lbg3Vm7H3aUyfHdFVyEmrmTbueqN1ZpaSEFRGkaChxw_LHzGoBLr_ohK7-782es52y9GpcGXuuTYHsjDS_sXTKl8A3z1jjjlow4X7yvs8ga1ElN-Ql4LsISqZzmzv93RkZqfl_ch-P_dbCf49Yol_tuImqpl2pk0X_XEQ3SQTKON8DCOHvsGXAjpktRYJyBzcIfZ4AiFGFGsd5445ffh45gdgFGd436566454576gdfgBgfhdgHDGHDfghrtyrty567YJFGhj";
		
		int pos = (int)(Math.random()*9 + 1);
		if(pos > 9) pos = 9;
		
		return new RegresoAccessToken("bearer", tokens[pos], 3600, "corporate_tables.read corporate_accounts.read corporate_cards.read corporate_customers.read customers.read customers_data.read retail_accounts.read retail_cards.read retail_customers.read audit.write");
    }
	
}
