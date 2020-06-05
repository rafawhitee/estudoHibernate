package util;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public abstract class Util implements Serializable {

	private static final long serialVersionUID = 1L;

	public static LocalDate localDateEspecifico(Integer ano, Integer mes, Integer dia) {
		if (ano != null && mes != null && dia != null) {
			try {
				LocalDate localDateOf = LocalDate.of(ano, mes, dia);
				return localDateOf;
			} catch (Exception e) {
				return null;
			}
		}
		return null;
	}

	public static Date dataEspecifica(Integer ano, Integer mes, Integer dia) {
		LocalDate localDateOf = localDateEspecifico(ano, mes, dia);
		if (localDateOf != null) {
			Date dataEspecifica = Date.from(localDateOf.atStartOfDay(ZoneId.systemDefault()).toInstant());
			return dataEspecifica;
		}
		return null;
	}

	public static LocalDate localDateAtual() {
		LocalDate localDateNow = LocalDate.now();
		return localDateNow;
	}

	public static Date dataAtual() {
		LocalDate localDateNow = localDateAtual();
		Date nascimento = Date.from(localDateNow.atStartOfDay(ZoneId.systemDefault()).toInstant());
		return nascimento;
	}

}