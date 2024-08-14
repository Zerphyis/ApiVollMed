package med.voll.api.medico;

public record Dados_listagemMedico(Long id,String nome,String email,String crm,Especialidade especialidade) {
    public Dados_listagemMedico(Medico medico){
        this(medico.getId(),medico.getNome(),medico.getEmail(),medico.getCrm(),medico.getEspecialidade());
    }

}
