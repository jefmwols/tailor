from tailor.swift.swiftlistener import SwiftListener
from tailor.utils.charformat import isUpperCamelCase


class MainListener(SwiftListener):

    def enterClassName(self, ctx):
        className = ctx.getText()
        if not isUpperCamelCase(className):
            print('Line', str(ctx.start.line) + ':', 'Class names should be in UpperCamelCase')

    def enterEnumName(self, ctx):
        pass

    def enterEnumCaseName(self, ctx):
        pass

    def exitStructName(self, ctx):
        pass
