#!/usr/bin/env python
# -*- coding: utf-8 -*-

import random

def randomize():
    return random.randint(-250, 250)

class Pressure(object):
    def __init__(self):
        pass

    def get_value(self):
        return randomize()
