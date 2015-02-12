#!/usr/bin/env python
# -*- coding: utf-8 -*-

import requests
import json

url = "http://localhost:9000/api/v1/devices"
data = {'name': 'sensor de temperatura', 'valueType': 'float'}
headers = {'Content-type': 'application/json', 'Accept': 'text/plain'}
r = requests.post(url, data=json.dumps(data), headers=headers)
print r
