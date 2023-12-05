import java.util.ArrayList;
import java.util.List;

class Medicamento {
    private String nome;

    public Medicamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Insumo {
    private String nome;

    public Insumo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Procedimento {
    private String nome;
    private List<Medicamento> medicamentos;
    private List<Insumo> insumos;

    public Procedimento(String nome) {
        this.nome = nome;
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos.addAll(medicamentos);
    }

    public void adicionarInsumos(List<Insumo> insumos) {
        this.insumos.addAll(insumos);
    }
}

class AgenteSaude {
    private String nome;

    public AgenteSaude(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Medico extends AgenteSaude {
    private String especialidade;

    public Medico(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}

class Enfermeiro extends AgenteSaude {
    public Enfermeiro(String nome) {
        super(nome);
    }
}

class Paciente {
    private String nome;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Triagem {
    private Paciente paciente;
    private AgenteSaude enfermeiro;
    private String tipoAtendimento;

    public Triagem(Paciente paciente, AgenteSaude enfermeiro, String tipoAtendimento) {
        this.paciente = paciente;
        this.enfermeiro = enfermeiro;
        this.tipoAtendimento = tipoAtendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public AgenteSaude getEnfermeiro() {
        return enfermeiro;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    // Método para identificar o paciente na triagem
    public void identificarPaciente() {
      
    }

    // Método para cadastrar o paciente após a identificação
    public void cadastrarPaciente() {
     
    }

    // Método para identificar o tipo de atendimento na triagem
    public void identificarTipoAtendimento() {
        
    }
}


class Atendimento {
    private Paciente paciente;
    private AgenteSaude medico;

    public Atendimento(Paciente paciente, AgenteSaude medico) {
        this.paciente = paciente;
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public AgenteSaude getMedico() {
        return medico;
    }
}

class RegistroProcedimento {
    private Procedimento procedimento;
    private AgenteSaude medico;
    private AgenteSaude enfermeiro;

    public RegistroProcedimento(Procedimento procedimento, AgenteSaude medico, AgenteSaude enfermeiro) {
        this.procedimento = procedimento;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public AgenteSaude getMedico() {
        return medico;
    }

    public AgenteSaude getEnfermeiro() {
        return enfermeiro;
    }
}

class ProcedimentoParte {
    private Procedimento procedimentoPai;
    private Procedimento procedimentoFilho;

    public ProcedimentoParte(Procedimento procedimentoPai, Procedimento procedimentoFilho) {
        this.procedimentoPai = procedimentoPai;
        this.procedimentoFilho = procedimentoFilho;
    }

    public Procedimento getProcedimentoPai() {
        return procedimentoPai;
    }

    public Procedimento getProcedimentoFilho() {
        return procedimentoFilho;
    }
}

public class Hospital {
    private List<Medicamento> medicamentos = new ArrayList<>();
    private List<Insumo> insumos = new ArrayList<>();
    private List<Procedimento> procedimentos = new ArrayList<>();
    private List<AgenteSaude> agentesSaude = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Triagem> triagens = new ArrayList<>();
    private List<Atendimento> atendimentos = new ArrayList<>();
    private List<RegistroProcedimento> registrosProcedimentos = new ArrayList<>();
    private List<ProcedimentoParte> procedimentosPartes = new ArrayList<>();

    public void cadastrarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void cadastrarInsumo(Insumo insumo) {
        insumos.add(insumo);
    }

    public void cadastrarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    public void cadastrarAgenteSaude(AgenteSaude agenteSaude) {
        agentesSaude.add(agenteSaude);
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void registrarTriagem(Triagem triagem) {
        triagens.add(triagem);
    }

    public void registrarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public void registrarProcedimento(Procedimento procedimento, AgenteSaude medico, AgenteSaude enfermeiro,
                                      List<Medicamento> medicamentosUsados, List<Insumo> insumosUsados) {
        RegistroProcedimento registro = new RegistroProcedimento(procedimento, medico, enfermeiro);
        registrosProcedimentos.add(registro);

        procedimento.adicionarMedicamentos(medicamentosUsados);
        procedimento.adicionarInsumos(insumosUsados);
    }

    public void registrarProcedimentoParte(Procedimento procedimentoPai, Procedimento procedimentoFilho) {
        ProcedimentoParte procedimentoParte = new ProcedimentoParte(procedimentoPai, procedimentoFilho);
        procedimentosPartes.add(procedimentoParte);
    }

    public static void main(String[] args) {
    
       
    }
}
