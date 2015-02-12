#!/usr/bin/env python
# -*- coding: utf-8 -*-

import requests
import json

url = "http://localhost:9000/records"
data = {'uuid': 'cd4b8917-fb8d-42fc-b3cc-4bb3404dfb7d', 'value': '25.5', 'createdAt': '2015-02-11 20:31 UTC'}
headers = {'Content-type': 'application/json', 'Accept': 'text/plain'}
r = requests.post(url, data=json.dumps(data), headers=headers)
print r
