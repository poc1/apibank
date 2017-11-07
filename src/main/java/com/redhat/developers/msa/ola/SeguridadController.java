package com.redhat.developers.msa.ola;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.developers.pojo.CredencialAcessToken;
import com.redhat.developers.pojo.CredencialLogin;
import com.redhat.developers.pojo.RegresoAccessToken;
import com.redhat.developers.pojo.TokenCredencial;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/seguridad")
public class SeguridadController {

	
	@CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/credencial", produces = "application/json")
    @ApiOperation("regresa el token credencial o corporativo")
    public TokenCredencial holamundo() {
		return new TokenCredencial("QjQ2NTFDNjFGNTA5RkYwRjZGMEI0NEYyIzE4MC4xMDEuMTE2LjkjMTQ4MzYzMDgxMTMyNSNQRDk0Yld3Z2RtVnljMmx2YmowaU1TNHdJaUJsYm1OdlpHbHVaejBpU1ZOUExUZzROVGt0TVNJL1BqeDBiMnRsYmtSbFptbHVhWFJwYjI0K1BHNWhiV1UrUW1GeWNtbGxiblJ2Y3lCR1pYSnlkWHBqWVN3Z1JHRnRZWEpwY3p3dmJtRnRaVDQ4WVd4cFlYTStiakF4TURJM056d3ZZV3hwWVhNK1BIVnpaWEpKUkQ1dU1ERXdNamMzUEM5MWMyVnlTVVErUEM5MGIydGxia1JsWm1sdWFYUnBiMjQrI0RFU2VkZS9DQkMvUEtDUzVQYWRkaW5nI3YxI21leGljb2ludHJhbmV0I05PVF9VU0VEI1NIQTF3aXRoUlNBI3JOeitDV2xNUk1GQ3NSL2cwSUFNK0pQdUdlOUxFZjZEY29QSUJza2FKQmtXUVVPd3ovQ0phQktndndXcE5VVEEwL2dwdHQ3Z1hHM3hlZmVSeHdRR1ZWbnhmdEEyRWZ4bERmNkFDRkdKelFBdmZqVDNaVXgwM1YzMVJYZnllN3J6eSs5ZGR3c041cFl5eEtuVnZBL2lpQWRHc3RjRUF1UE8wck5lWjM3ZFpSND0=");
    }
	
	
	@CrossOrigin
	@RequestMapping(value="/credencial/", method=RequestMethod.POST)
	@ApiOperation(value = "Obtener el token credencial o corporativo ( en base en el login de un usuario y pass fijos )", response = TokenCredencial.class, produces = "application/json")
    public @ResponseBody TokenCredencial posttokencorporativo(@RequestBody CredencialLogin login) {
		return new TokenCredencial("QjQ2NTFDNjFGNTA5RkYwRjZGMEI0NEYyIzE4MC4xMDEuMTE2LjkjMTQ4MzYzMDgxMTMyNSNQRDk0Yld3Z2RtVnljMmx2YmowaU1TNHdJaUJsYm1OdlpHbHVaejBpU1ZOUExUZzROVGt0TVNJL1BqeDBiMnRsYmtSbFptbHVhWFJwYjI0K1BHNWhiV1UrUW1GeWNtbGxiblJ2Y3lCR1pYSnlkWHBqWVN3Z1JHRnRZWEpwY3p3dmJtRnRaVDQ4WVd4cFlYTStiakF4TURJM056d3ZZV3hwWVhNK1BIVnpaWEpKUkQ1dU1ERXdNamMzUEM5MWMyVnlTVVErUEM5MGIydGxia1JsWm1sdWFYUnBiMjQrI0RFU2VkZS9DQkMvUEtDUzVQYWRkaW5nI3YxI21leGljb2ludHJhbmV0I05PVF9VU0VEI1NIQTF3aXRoUlNBI3JOeitDV2xNUk1GQ3NSL2cwSUFNK0pQdUdlOUxFZjZEY29QSUJza2FKQmtXUVVPd3ovQ0phQktndndXcE5VVEEwL2dwdHQ3Z1hHM3hlZmVSeHdRR1ZWbnhmdEEyRWZ4bERmNkFDRkdKelFBdmZqVDNaVXgwM1YzMVJYZnllN3J6eSs5ZGR3c041cFl5eEtuVnZBL2lpQWRHc3RjRUF1UE8wck5lWjM3ZFpSND0=");
    }
	
	@CrossOrigin
	@RequestMapping(value="/accesstoken/", method=RequestMethod.POST)
	@ApiOperation(value = "Obtener el AccessToken", response = RegresoAccessToken.class, produces = "application/json")
    public @ResponseBody RegresoAccessToken postaccesstoken(@RequestBody CredencialAcessToken credencial) {
		return new RegresoAccessToken("bearer", "AAS2NTFDNjFGNTA5RkYwRjZGMEI0NEYyIzE4MC4xMDEuMTE2LjkjMTQ4MzYzMDgxMTMyNSNQRDk0Yld3Z2RtVnljMmx2YmowaU1TNHdJaUJsYm1OdlpHbHVaejBpU1ZOUExUZzROVGt0TVNJL1BqeDBiMnRsYmtSbFptbHVhWFJwYjI0K1BHNWhiV1UrUW1GeWNtbGxiblJ2Y3lCR1pYSnlkWHBqWVN3Z1JHRnRZWEpwY3p3dmJtRnRaVDQ4WVd4cFlYTStiakF4TURJM056d3ZZV3hwWVhNK1BIVnpaWEpKUkQ1dU1ERXdNamMzUEM5MWMyVnlTVVErUEM5MGIydGxia1JsWm1sdWFYUnBiMjQrI0RFU2VkZS9DQkMvUEtDUzVQYWRkaW5nI3YxI21leGljb2ludHJhbmV0I05PVF9VU0VEI1NIQTF3aXRoUlNBI3JOeitDV2xNUk1GQ3NSL2cwSUFNK0pQdUdlOUxFZjZEY29QSUJza2FKQmtXUVVPd3ovQ0phQktndndXcE5VVEEwL2dwdHQ3Z1hHM3hlZmVSeHdRR1ZWbnhmdEEyRWZ4bERmNkFDRkdKelFBdmZqVDNaVXgwM1YzMVJYZnllN3J6eSs5ZGR3c041cFl5eEtuVnZBL2lpQWRHc3RjRUF1UE8wck5lWjM3ZFpSND0=", 3600, "corporate_tables.read corporate_accounts.read corporate_cards.read corporate_customers.read customers.read customers_data.read retail_accounts.read retail_cards.read retail_customers.read audit.write");
    }
	
}
