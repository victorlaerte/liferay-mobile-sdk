package com.liferay.mobile.sdk.v62.layoutprototype;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/layoutprototype")
public interface LayoutPrototypeService {
  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active);

  @Path("/add-layout-prototype")
  Call<JSONObject> addLayoutPrototype(@Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-layout-prototype")
  Call<Response> deleteLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId);

  @Path("/get-layout-prototype")
  Call<JSONObject> getLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "active") boolean active, @Param(name = "obc", className = "com.liferay.portal.kernel.util.OrderByComparator") JSONObject obc);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active);

  @Path("/update-layout-prototype")
  Call<JSONObject> updateLayoutPrototype(@Param(name = "layoutPrototypeId") long layoutPrototypeId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "description") String description, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
