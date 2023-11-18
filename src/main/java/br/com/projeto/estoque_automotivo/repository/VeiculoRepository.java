    package br.com.projeto.estoque_automotivo.controller;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import  br.com.projeto.model.Veiculo;

    @Repository
    public interface VeiculoRepository extends JpaRepository <Veiculo, Long> {
    
    }