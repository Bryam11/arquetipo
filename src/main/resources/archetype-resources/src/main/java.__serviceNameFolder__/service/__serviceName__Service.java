package ${package}.${serviceNameFolder.replace('/','.')}.service;

import ${package}.${serviceNameFolder.replace('/','.')}.resources.entity.${serviceName};
import java.util.List;

public interface ${serviceName}Service  {

    List<${serviceName}> getAll();

    ${serviceName} save(${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

    ${serviceName} update(${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

    ${serviceName} delete(Integer id);

    ${serviceName} getById(Integer id);
}