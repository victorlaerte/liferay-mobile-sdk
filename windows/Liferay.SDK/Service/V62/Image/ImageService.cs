/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V62.Image
{
	public class ImageService : ServiceBase
	{
		public ImageService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> GetImageAsync(long imageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("imageId", imageId);

			var _command = new JsonObject()
			{
				{ "/image/get-image", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}