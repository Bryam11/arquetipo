package ${package}.${serviceNameFolder.replace('/','.')}.repository;

import ${package}.${serviceNameFolder.replace('/','.')}.resources.entity.${serviceName};
import org.springframework.data.jpa.repository.JpaRepository;
public interface ${serviceName}Repository extends JpaRepository<${serviceName}, Long> {}
}