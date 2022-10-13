import pygame
'''Usado para desenvolvimento de jogos e sons'''
pygame.init()
'''comando acima inicia o módulo'''
pygame.mixer.music.load("nomedoarquivo.mp3")
pygame.mixer.music.play()

pygame.event.wait()
'''Comando acima aguarda todo o procedimento para finalizar o módulo'''
