package com.maple.pro.courier.usermanagementms.web.controllers.interfaces;

import com.maple.pro.courier.usermanagementms.core.models.dto.User;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserUpdate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.util.List;


@Validated
@Tag(name = "User Operations", description = "Endpoints to perform CRUD operation on User")
public interface IUserController {


    /**
     * POST /create-user : Create a new user
     *
     * @param user  (required)
     * @return User created successfully (status code 201)
     */
    @Operation(
            operationId = "createUser",
            summary = "Create a new user",
            tags = { "User Operations" },
            responses = {
                    @ApiResponse(responseCode = "201", description = "User created successfully", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/create-user",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    ResponseEntity<UserResponse> createUser(@Parameter(name = "User", description = "", required = true) @Valid @RequestBody User user);


    /**
     * DELETE /delete-user/{id} : Delete a user&#39;s account
     *
     * @param id  (required)
     * @return User deleted successfully (status code 204)
     */
    @Operation(
            operationId = "deleteUser",
            summary = "Delete a user's account",
            tags = { "User Operations" },
            responses = {
                    @ApiResponse(responseCode = "204", description = "User deleted successfully")
            }
    )
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/delete-user/{id}"
    )

    ResponseEntity<String> deleteUser(@Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") String id);


    /**
     * GET /get-user/{id} : Retrieve a user&#39;s details
     *
     * @param id  (required)
     * @return User details retrieved successfully (status code 200)
     */
    @Operation(
            operationId = "getUserById",
            summary = "Retrieve a user's details",
            tags = { "User Operations" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "User details retrieved successfully", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/get-user/{id}",
            produces = { "application/json" }
    )

    ResponseEntity<UserResponse> getUserById(
            @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    );


    /**
     * GET /get-user : Get a list of users based on filters
     *
     * @param mobileNumber Filter by user&#39;s mobile number. (optional)
     * @param createdAt Filter by the date the user was created. Use ISO 8601 format. (optional)
     * @param updatedAt Filter by the date the user was last updated. Use ISO 8601 format. (optional)
     * @param email Filter by the user&#39;s email ID. (optional)
     * @return A list of users matching the filters. (status code 200)
     */
    @Operation(
            operationId = "getUsersByFilters",
            summary = "Get a list of users based on filters",
            tags = { "User Operations" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "A list of users matching the filters.", content = {
                            @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserResponse.class)))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/get-user",
            produces = { "application/json" }
    )

    ResponseEntity<List<UserResponse>> getUsersByFilters(
            @Parameter(name = "mobileNumber", description = "Filter by user's mobile number.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "mobileNumber", required = false) String mobileNumber,
            @Parameter(name = "createdAt", description = "Filter by the date the user was created. Use ISO 8601 format.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "createdAt", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime createdAt,
            @Parameter(name = "updatedAt", description = "Filter by the date the user was last updated. Use ISO 8601 format.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "updatedAt", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime updatedAt,
            @Parameter(name = "email", description = "Filter by the user's email ID.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "email", required = false) String email
    );

    /**
     * PUT /update-user/{id} : Update a user&#39;s details
     *
     * @param id  (required)
     * @param userUpdate  (required)
     * @return User updated successfully (status code 200)
     */
    @Operation(
            operationId = "updateUser",
            summary = "Update a user's details",
            tags = { "User Operations" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "User updated successfully", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/update-user/{id}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )

    ResponseEntity<UserResponse> updateUser(
            @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
            @Parameter(name = "UserUpdate", description = "", required = true) @Valid @RequestBody UserUpdate userUpdate
    );

}
