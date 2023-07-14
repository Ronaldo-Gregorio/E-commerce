package com.ronaldo.userapi.response;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;

import com.ronaldo.userapi.model.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	@NotBlank(message = "Nome é obrigatorio!")
	private String nome;
	@NotBlank(message = "CPF é obrigatorio!")
	private String cpf;
	private String endereco;
	@NotBlank(message = "E-mail é obrigatorio!")
	private String email;
	private String telefone;
	private LocalDateTime dataCadastro;
	
	public static UserDTO convert(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setNome(user.getNome());
		userDTO.setCpf(user.getCpf());
		userDTO.setEndereco(user.getEndereco());
		userDTO.setEmail(user.getEmail());
		userDTO.setTelefone(user.getTelefone());
		userDTO.setDataCadastro(user.getDataCadastro());
		return userDTO;
	}
}