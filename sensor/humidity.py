#!/usr/bin/env python
# -*- coding: utf-8 -*-

import random

def randomize():
    return random.randint(0, 100)

class Humidity(object):
    def __init__(self):
        pass

    def get_value(self):
        return randomize()
