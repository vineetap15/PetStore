package utils.models.pet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"category",
"name",
"photoUrls",
"tags",
"status"
})
public class CreatePet {

@JsonProperty("id")
private Integer id;
@JsonProperty("category")
private Category category;
@JsonProperty("name")
private String name;
@JsonProperty("photoUrls")
private List<String> photoUrls = null;
@JsonProperty("tags")
private List<Tag> tags = null;
@JsonProperty("status")
private String status;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("category")
public Category getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(Category category) {
this.category = category;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("photoUrls")
public List<String> getPhotoUrls() {
return photoUrls;
}

@JsonProperty("photoUrls")
public void setPhotoUrls(List<String> photoUrls) {
this.photoUrls = photoUrls;
}

@JsonProperty("tags")
public List<Tag> getTags() {
return tags;
}

@JsonProperty("tags")
public void setTags(List<Tag> tags) {
this.tags = tags;
}

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}
}