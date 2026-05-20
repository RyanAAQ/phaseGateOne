from unittest import TestCase
from facebook_like_system import *

class TestFacebook(TestCase):

    def test_that_the_likes_are_displayed(self):
        names = {}
        actual = likes(names)
        expected = "no one likes this"
        self.assertEqual(actual, expected) 
        
    def test_that_the_one_like_is_shown(self):
        names = {"peter"}
        actual = likes(names)
        expected = "peter likes this"
        self.assertEqual(actual, expected) 
