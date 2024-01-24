package ${package}.${serviceNameFolder.replace('/','.')}.controller;

import org.springframework.web.bind.annotation.RestController;
import jdk.jfr.Description;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Content;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

import ${package}.${serviceNameFolder.replace('/','.')}.service.${serviceName}Service;
import ${package}.${serviceNameFolder.replace('/','.')}.resources.mapper.ApiModelResponse;
import ${package}.${serviceNameFolder.replace('/','.')}.resources.dto.${serviceName}DTO;

@RestController
@Description("Item Controller")
@Tag(name = "Item Controller", description = "Controller for Item")
@RequestMapping("/item")
@RequiredArgsConstructor
public class  ${serviceName}Controller {

    private final ${serviceName}Service ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service;

    @PostMapping(produces = "application/json")
    @Operation(summary = "Pre Billing Validation", description = "Find Pre Billing Validation by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = ApiModelResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Not found", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = ApiModelResponse.class))}),
            @ApiResponse(responseCode = "500", description = "Internal error", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = ApiModelResponse.class))})
    })
    public ResponseEntity<ApiModelResponse> getPreBillingValidation(@Valid @RequestBody ${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}) {
        ApiModelResponse apiModelResponse = new ApiModelResponse(
                "200",
                "OK",
                "OK",
                ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.save(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)})
        );
        return ResponseEntity.ok(apiModelResponse);
    }
}