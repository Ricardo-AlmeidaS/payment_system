package bnr.com.ricardo.pagamentos.repository;

import bnr.com.ricardo.pagamentos.models.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
